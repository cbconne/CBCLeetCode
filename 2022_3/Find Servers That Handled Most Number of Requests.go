package study2022_3

import "sort"

func BusiestServers(k int, arrival []int, load []int) []int {
	res := make(map[int]int)

	var serverStatus ServerStatusList

	available := map[int]bool{}
	for i := 0; i < k; i++ {
		available[i] = true
		res[i] = 0
	}

	for i, arrTime := range arrival {
		setServersIdle(&serverStatus, arrTime, available)
		if len(available) == 0 {
			continue
		}
		idleServer := getIdleServer(i, available, k)
		delete(available, idleServer)
		serverStatus = append(serverStatus, ServerStatus{idleServer, arrTime + load[i]})
		res[idleServer]++
	}
	return getBusyServers(res)
}

func setServersIdle(serverStatus *ServerStatusList, time int, available map[int]bool) {
	sort.Sort(serverStatus)
	idleI := 0
	for i, v := range *serverStatus {
		if v.IdleTime <= time {
			available[v.No] = true
		} else {
			idleI = i
			break
		}
	}
	temp := *serverStatus
	*serverStatus = temp[idleI:]
}

func getIdleServer(i int, available map[int]bool, k int) int {
	for {
		_, ok := available[i%k]
		if ok {
			return i % k
		} else {
			i++
		}
	}
}

func getBusyServers(res map[int]int) []int {
	cnt := -1
	busyI := make([]int, 0)
	for i, v := range res {
		if v > cnt {
			cnt = v
			busyI = make([]int, 0)
			busyI = append(busyI, i)
		} else if v == cnt {
			busyI = append(busyI, i)
		}
	}
	return busyI
}

type ServerStatus struct {
	No       int
	IdleTime int
}

type ServerStatusList []ServerStatus

func (s ServerStatusList) Len() int { return len(s) }

func (s ServerStatusList) Less(i, j int) bool {
	return s[i].IdleTime < s[j].IdleTime
}

func (s ServerStatusList) Swap(i, j int) {
	s[i], s[j] = s[j], s[i]
}

// 超时了，官解没细看，想复习去官网看吧
// https://leetcode-cn.com/problems/find-servers-that-handled-most-number-of-requests/solution/zhao-dao-chu-li-zui-duo-qing-qiu-de-fu-w-e0a5/
