#!/bin/bash

# List of dates to check for in directory names
dates=("2011-06-15" "2013-02-18" "2015-02-02" "2015-12-01" "2016-01-01" "2016-11-28" "2017-05-13" "2017-10-01" 
       "2018-04-01" "2018-06-18" "2018-10-26" "2019-01-02" "2019-07-18" "2020-03-31" "2021.11.12"
       "2012-08-10" "2015-01-01" "2015-10-07" "2015-12-10" "2016-11-25" "2017-03-25" "2017-08-08" 
       "2017-10-30" "2018-05-22" "2018-08-08" "2018-11-05" "2019-03-26" "2020-03-01" "2020-05-31" "2023.2.27")

# Loop through the list of dates
for date in "${dates[@]}"; do
  # Find and remove directories that contain the specific date in their name
  find . -type d -name "*$date*" -exec rm -rf {} +
done
