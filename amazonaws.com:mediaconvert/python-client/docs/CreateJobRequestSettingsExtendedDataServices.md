# CreateJobRequestSettingsExtendedDataServices


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**copy_protection_action** | [**CopyProtectionAction**](CopyProtectionAction.md) |  | [optional] 
**vchip_action** | [**VchipAction**](VchipAction.md) |  | [optional] 

## Example

```python
from openapi_client.models.create_job_request_settings_extended_data_services import CreateJobRequestSettingsExtendedDataServices

# TODO update the JSON string below
json = "{}"
# create an instance of CreateJobRequestSettingsExtendedDataServices from a JSON string
create_job_request_settings_extended_data_services_instance = CreateJobRequestSettingsExtendedDataServices.from_json(json)
# print the JSON string representation of the object
print(CreateJobRequestSettingsExtendedDataServices.to_json())

# convert the object into a dict
create_job_request_settings_extended_data_services_dict = create_job_request_settings_extended_data_services_instance.to_dict()
# create an instance of CreateJobRequestSettingsExtendedDataServices from a dict
create_job_request_settings_extended_data_services_from_dict = CreateJobRequestSettingsExtendedDataServices.from_dict(create_job_request_settings_extended_data_services_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


