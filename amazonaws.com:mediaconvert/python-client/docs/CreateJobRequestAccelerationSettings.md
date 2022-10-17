# CreateJobRequestAccelerationSettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mode** | [**AccelerationMode**](AccelerationMode.md) |  | 

## Example

```python
from openapi_client.models.create_job_request_acceleration_settings import CreateJobRequestAccelerationSettings

# TODO update the JSON string below
json = "{}"
# create an instance of CreateJobRequestAccelerationSettings from a JSON string
create_job_request_acceleration_settings_instance = CreateJobRequestAccelerationSettings.from_json(json)
# print the JSON string representation of the object
print(CreateJobRequestAccelerationSettings.to_json())

# convert the object into a dict
create_job_request_acceleration_settings_dict = create_job_request_acceleration_settings_instance.to_dict()
# create an instance of CreateJobRequestAccelerationSettings from a dict
create_job_request_acceleration_settings_from_dict = CreateJobRequestAccelerationSettings.from_dict(create_job_request_acceleration_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


