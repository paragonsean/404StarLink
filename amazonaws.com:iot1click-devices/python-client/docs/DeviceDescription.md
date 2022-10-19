# DeviceDescription


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
from openapi_client.models.device_description import DeviceDescription

# TODO update the JSON string below
json = "{}"
# create an instance of DeviceDescription from a JSON string
device_description_instance = DeviceDescription.from_json(json)
# print the JSON string representation of the object
print(DeviceDescription.to_json())

# convert the object into a dict
device_description_dict = device_description_instance.to_dict()
# create an instance of DeviceDescription from a dict
device_description_from_dict = DeviceDescription.from_dict(device_description_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


