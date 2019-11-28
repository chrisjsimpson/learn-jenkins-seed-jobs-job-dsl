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
