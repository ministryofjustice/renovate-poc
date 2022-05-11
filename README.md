# Renovate proof of concept

- Created this project to test [Renovate](https://github.com/renovatebot/renovate)
- Generated it from Kotlin template hence Kotlin & Gradle specific config
- [Renovate bot logs](https://app.renovatebot.com/dashboard#github/ministryofjustice/renovate-poc)

## Configuration 

Documented my thinking for the configuration I've set here:

- [Schedule](https://docs.renovatebot.com/key-concepts/scheduling/)
  - Renovate should run and raise pull requests during business hours
- Disable [Dependency Dashboard](https://docs.renovatebot.com/key-concepts/dashboard)
  - With the custom schedule configured we do not need the dashboard to trigger Renovate to run on a repo
- `CODEOWNERS`
  - To comply with [Ministry of Justice GitHub Repository Standards](https://github.com/ministryofjustice/github-repository-standards) a project should have this
  - Renovate will assign pull requests based on this configuration
- Specify package managers
  - Renovate supports [quite a long list of managers](https://docs.renovatebot.com/modules/manager/#supported-managers) and I thought it was better to be explicit about which are enabled

And reasons for not enabling other configuration:

- Grouping updates in a single pull request 
  - There are pros and cons to this - fewer PRs to merge, but teams may want finer grain of control over which library updates go when as they may not interact well
  - Seems like one for each team to make a call on
- Automerge
  - This simply didn't seem like a good idea

## Post PoC

- Raised [Jira ticket](https://dsdmoj.atlassian.net/browse/INC-556) to test it against actual projects and see how the team find it
- Disabled the Renovate Bot on this repo
- Will archive the repo in due course
