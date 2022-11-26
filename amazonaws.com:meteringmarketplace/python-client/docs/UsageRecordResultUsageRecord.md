# UsageRecordResultUsageRecord


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
from openapi_client.models.usage_record_result_usage_record import UsageRecordResultUsageRecord

# TODO update the JSON string below
json = "{}"
# create an instance of UsageRecordResultUsageRecord from a JSON string
usage_record_result_usage_record_instance = UsageRecordResultUsageRecord.from_json(json)
# print the JSON string representation of the object
print(UsageRecordResultUsageRecord.to_json())

# convert the object into a dict
usage_record_result_usage_record_dict = usage_record_result_usage_record_instance.to_dict()
# create an instance of UsageRecordResultUsageRecord from a dict
usage_record_result_usage_record_from_dict = UsageRecordResultUsageRecord.from_dict(usage_record_result_usage_record_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


