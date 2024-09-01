#!/usr/bin/env bash
echo 'Copy files...'
scp target/HRT-0.0.1-SNAPSHOT.jar \
    root@109.71.241.118:/home
echo 'Restart server...'
#ssh -t root@85.92.110.200 << EOF
#pgrep java | xargs kill -9
#nohup java -jar /home/lvpd-0.0.1-SNAPSHOT.jar > /home/lvpd/log.txt &
#EOF
echo 'Bye'