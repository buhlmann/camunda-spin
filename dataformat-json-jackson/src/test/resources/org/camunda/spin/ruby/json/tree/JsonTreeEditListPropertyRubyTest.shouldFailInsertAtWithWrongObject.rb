require 'date'

node = JSON($input)
customers = node.prop("customers")

customers.insertAt(1, Date.today)