# BatchMeterUsageRequest

A <code>BatchMeterUsageRequest</code> contains <code>UsageRecords</code>, which indicate quantities of usage within your application.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**usage_records** | **List** |  | 
**product_code** | **str** |  | 

## Example

```python
from openapi_client.models.batch_meter_usage_request import BatchMeterUsageRequest

# TODO update the JSON string below
json = "{}"
# create an instance of BatchMeterUsageRequest from a JSON string
batch_meter_usage_request_instance = BatchMeterUsageRequest.from_json(json)
# print the JSON string representation of the object
print(BatchMeterUsageRequest.to_json())

# convert the object into a dict
batch_meter_usage_request_dict = batch_meter_usage_request_instance.to_dict()
# create an instance of BatchMeterUsageRequest from a dict
batch_meter_usage_request_from_dict = BatchMeterUsageRequest.from_dict(batch_meter_usage_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


