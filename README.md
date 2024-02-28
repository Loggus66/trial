Run ansible task with 
ansible-playbook -i localhost --extra-vars='{"string": "AAAAABBDCAAADDDDBC"}' string.yml
and
ansible-playbook -i <remote-ip>, ssh.yml
or
ansible-playbook -i localhost ssh.yml

