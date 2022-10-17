# Av1QvbrSettings

Settings for quality-defined variable bitrate encoding with the AV1 codec. Use these settings only when you set QVBR for Rate control mode (RateControlMode).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**qvbr_quality_level** | **int** |  | [optional] 
**qvbr_quality_level_fine_tune** | **float** |  | [optional] 

## Example

```python
from openapi_client.models.av1_qvbr_settings import Av1QvbrSettings

# TODO update the JSON string below
json = "{}"
# create an instance of Av1QvbrSettings from a JSON string
av1_qvbr_settings_instance = Av1QvbrSettings.from_json(json)
# print the JSON string representation of the object
print(Av1QvbrSettings.to_json())

# convert the object into a dict
av1_qvbr_settings_dict = av1_qvbr_settings_instance.to_dict()
# create an instance of Av1QvbrSettings from a dict
av1_qvbr_settings_from_dict = Av1QvbrSettings.from_dict(av1_qvbr_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


