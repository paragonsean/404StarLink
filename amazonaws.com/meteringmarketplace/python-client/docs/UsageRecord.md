# UsageRecord

<p>A <code>UsageRecord</code> indicates a quantity of usage for a given product, customer, dimension and time.</p> <p>Multiple requests with the same <code>UsageRecords</code> as input will be de-duplicated to prevent double charges.</p>

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**timestamp** | **datetime** |  | 
**customer_identifier** | **str** |  | 
**dimension** | **str** |  | 
**quantity** | **int** |  | [optional] 
**usage_allocations** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.usage_record import UsageRecord

# TODO update the JSON string below
json = "{}"
# create an instance of UsageRecord from a JSON string
usage_record_instance = UsageRecord.from_json(json)
# print the JSON string representation of the object
print(UsageRecord.to_json())

# convert the object into a dict
usage_record_dict = usage_record_instance.to_dict()
# create an instance of UsageRecord from a dict
usage_record_from_dict = UsageRecord.from_dict(usage_record_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


