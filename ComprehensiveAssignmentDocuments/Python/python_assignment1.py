import csv
class ReadAndWriteData:
    with open(r'E:\Selenium Projects\CSVfile.csv', 'r') as file:
        read = csv.reader(file)
        data = list(read)
        print(data)

