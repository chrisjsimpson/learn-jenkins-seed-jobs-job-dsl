folder('OBP')

job('OBP/OBP-build') {
    scm {
      git('https://github.com/OpenBankProject/OBP-CLI.git')
    }
}

queue('OBP/OBP-build')
