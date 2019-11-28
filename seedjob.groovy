folder('OBP')

pipelineJob('OBP/OBP-build') {
    description = "Build of OBP-CLI"
    definition {
        cpsScm {
            scm {
              git('/Users/chrissimpson/Documents/programming/jenkins/OBP-CLI')
            }
        }
    }
}

queue('OBP/OBP-build')

// A simple job
job('simple-job-new-name') {
  scm {
    git('git@github.com:OpenBankProject/OBP-CLI.git')
  }
}

