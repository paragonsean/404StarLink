# MeterUsageRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**product_code** | **str** |  | 
**timestamp** | **datetime** |  | 
**usage_dimension** | **str** |  | 
**usage_quantity** | **int** |  | [optional] 
**dry_run** | **bool** |  | [optional] 
**usage_allocations** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.meter_usage_request import MeterUsageRequest

# TODO update the JSON string below
json = "{}"
# create an instance of MeterUsageRequest from a JSON string
meter_usage_request_instance = MeterUsageRequest.from_json(json)
# print the JSON string representation of the object
print(MeterUsageRequest.to_json())

# convert the object into a dict
meter_usage_request_dict = meter_usage_request_instance.to_dict()
# create an instance of MeterUsageRequest from a dict
meter_usage_request_from_dict = MeterUsageRequest.from_dict(meter_usage_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


