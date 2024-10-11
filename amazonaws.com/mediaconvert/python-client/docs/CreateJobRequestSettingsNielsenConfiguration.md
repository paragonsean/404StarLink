# CreateJobRequestSettingsNielsenConfiguration


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**breakout_code** | **int** |  | [optional] 
**distributor_id** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.create_job_request_settings_nielsen_configuration import CreateJobRequestSettingsNielsenConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of CreateJobRequestSettingsNielsenConfiguration from a JSON string
create_job_request_settings_nielsen_configuration_instance = CreateJobRequestSettingsNielsenConfiguration.from_json(json)
# print the JSON string representation of the object
print(CreateJobRequestSettingsNielsenConfiguration.to_json())

# convert the object into a dict
create_job_request_settings_nielsen_configuration_dict = create_job_request_settings_nielsen_configuration_instance.to_dict()
# create an instance of CreateJobRequestSettingsNielsenConfiguration from a dict
create_job_request_settings_nielsen_configuration_from_dict = CreateJobRequestSettingsNielsenConfiguration.from_dict(create_job_request_settings_nielsen_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


