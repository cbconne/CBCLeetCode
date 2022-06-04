package study2022_6

import "strings"

func NumUniqueEmails(emails []string) int {
	emailHash := make(map[string]bool)
	for _, email := range emails {
		email = parseEmail(email)
		if !emailHash[email] {
			emailHash[email] = true
		}
	}
	return len(emailHash)
}

func parseEmail(email string) string {
	ati := strings.Index(email, "@")
	local := email[0:ati]
	plusi := strings.Index(local, "+")
	if plusi != -1 {
		local = local[0:plusi]
	}
	local = strings.Replace(local, ".", "", -1)
	return local + email[ati:]
}
