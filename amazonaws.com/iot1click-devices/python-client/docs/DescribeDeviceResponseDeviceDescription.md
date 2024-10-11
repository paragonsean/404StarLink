# DescribeDeviceResponseDeviceDescription


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**arn** | **str** |  | [optional] 
**attributes** | **Dict** |  | [optional] 
**device_id** | **str** |  | [optional] 
**enabled** | **bool** |  | [optional] 
**remaining_life** | **float** |  | [optional] 
**type** | **str** |  | [optional] 
**tags** | **Dict** |  | [optional] 

## Example

```python
from openapi_client.models.describe_device_response_device_description import DescribeDeviceResponseDeviceDescription

# TODO update the JSON string below
json = "{}"
# create an instance of DescribeDeviceResponseDeviceDescription from a JSON string
describe_device_response_device_description_instance = DescribeDeviceResponseDeviceDescription.from_json(json)
# print the JSON string representation of the object
print(DescribeDeviceResponseDeviceDescription.to_json())

# convert the object into a dict
describe_device_response_device_description_dict = describe_device_response_device_description_instance.to_dict()
# create an instance of DescribeDeviceResponseDeviceDescription from a dict
describe_device_response_device_description_from_dict = DescribeDeviceResponseDeviceDescription.from_dict(describe_device_response_device_description_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


