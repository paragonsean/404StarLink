# CreateJobRequestSettingsKantarWatermark


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**channel_name** | **str** |  | [optional] 
**content_reference** | **str** |  | [optional] 
**credentials_secret_name** | **str** |  | [optional] 
**file_offset** | **float** |  | [optional] 
**kantar_license_id** | **int** |  | [optional] 
**kantar_server_url** | **str** |  | [optional] 
**log_destination** | **str** |  | [optional] 
**metadata3** | **str** |  | [optional] 
**metadata4** | **str** |  | [optional] 
**metadata5** | **str** |  | [optional] 
**metadata6** | **str** |  | [optional] 
**metadata7** | **str** |  | [optional] 
**metadata8** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.create_job_request_settings_kantar_watermark import CreateJobRequestSettingsKantarWatermark

# TODO update the JSON string below
json = "{}"
# create an instance of CreateJobRequestSettingsKantarWatermark from a JSON string
create_job_request_settings_kantar_watermark_instance = CreateJobRequestSettingsKantarWatermark.from_json(json)
# print the JSON string representation of the object
print(CreateJobRequestSettingsKantarWatermark.to_json())

# convert the object into a dict
create_job_request_settings_kantar_watermark_dict = create_job_request_settings_kantar_watermark_instance.to_dict()
# create an instance of CreateJobRequestSettingsKantarWatermark from a dict
create_job_request_settings_kantar_watermark_from_dict = CreateJobRequestSettingsKantarWatermark.from_dict(create_job_request_settings_kantar_watermark_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


