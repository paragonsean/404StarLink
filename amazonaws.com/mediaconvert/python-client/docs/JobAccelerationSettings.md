# JobAccelerationSettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mode** | [**AccelerationMode**](AccelerationMode.md) |  | 

## Example

```python
from openapi_client.models.job_acceleration_settings import JobAccelerationSettings

# TODO update the JSON string below
json = "{}"
# create an instance of JobAccelerationSettings from a JSON string
job_acceleration_settings_instance = JobAccelerationSettings.from_json(json)
# print the JSON string representation of the object
print(JobAccelerationSettings.to_json())

# convert the object into a dict
job_acceleration_settings_dict = job_acceleration_settings_instance.to_dict()
# create an instance of JobAccelerationSettings from a dict
job_acceleration_settings_from_dict = JobAccelerationSettings.from_dict(job_acceleration_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


