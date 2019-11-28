folder('project-a')

pipelineJob('example') {
    definition {
        cpsScm {
            scm {
              git('git@github.com:OpenBankProject/OBP-CLI.git')
            }
        }
    }
}
