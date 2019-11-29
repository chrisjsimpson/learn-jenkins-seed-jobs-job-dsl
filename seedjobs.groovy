folder('OBP')

pipelineJob('OBP/OBP-CLI') {
    triggers {
      //cron('*/2 * * * *')
    }
    description = "Build of OBP-CLI"
    definition {
        cpsScm {
            scm {
              git('/Users/chrissimpson/Documents/programming/jenkins/OBP-CLI')
            }
        }
    }
}

queue('OBP/OBP-CLI')

// OBP API
pipelineJob('OBP/OBP-API') {
  triggers {

  }
  description = "OBP API"
  definition {
    cpsScm {
      scm {
        git('https://github.com/chrisjsimpson/OBP-API.git')
      }
      scriptPath('Jenkinsfile.backup')
    }
  }
}

queue('OBP/OBP-API')
