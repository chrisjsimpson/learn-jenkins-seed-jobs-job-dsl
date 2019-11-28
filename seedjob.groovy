folder('OBPnew')

pipelineJob('OBPnew/OBP-build') {
    definition {
        cpsScm {
            scm {
              git('git@github.com:OpenBankProject/OBP-CLI.git')
            }
        }
    }
}

queue('OBP/OBP-build')
