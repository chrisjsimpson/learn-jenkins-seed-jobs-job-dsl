folder('OBP')

pipelineJob('OBP/OBP-build') {
    definition {
        cpsScm {
            scm {
              git('https://github.com/OpenBankProject/OBP-CLI.git')
            }
        }
    }
}

queue('OBP/OBP-build')
