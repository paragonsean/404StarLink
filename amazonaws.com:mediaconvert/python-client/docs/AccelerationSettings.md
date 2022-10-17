# AccelerationSettings

Accelerated transcoding can significantly speed up jobs with long, visually complex content.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mode** | [**AccelerationMode**](AccelerationMode.md) |  | 

## Example

```python
from openapi_client.models.acceleration_settings import AccelerationSettings

# TODO update the JSON string below
json = "{}"
# create an instance of AccelerationSettings from a JSON string
acceleration_settings_instance = AccelerationSettings.from_json(json)
# print the JSON string representation of the object
print(AccelerationSettings.to_json())

# convert the object into a dict
acceleration_settings_dict = acceleration_settings_instance.to_dict()
# create an instance of AccelerationSettings from a dict
acceleration_settings_from_dict = AccelerationSettings.from_dict(acceleration_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


