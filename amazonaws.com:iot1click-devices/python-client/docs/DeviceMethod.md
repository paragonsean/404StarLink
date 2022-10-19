# DeviceMethod


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**device_type** | **str** |  | [optional] 
**method_name** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.device_method import DeviceMethod

# TODO update the JSON string below
json = "{}"
# create an instance of DeviceMethod from a JSON string
device_method_instance = DeviceMethod.from_json(json)
# print the JSON string representation of the object
print(DeviceMethod.to_json())

# convert the object into a dict
device_method_dict = device_method_instance.to_dict()
# create an instance of DeviceMethod from a dict
device_method_from_dict = DeviceMethod.from_dict(device_method_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


