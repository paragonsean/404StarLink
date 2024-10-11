# KantarWatermarkSettings

Use these settings only when you use Kantar watermarking. Specify the values that MediaConvert uses to generate and place Kantar watermarks in your output audio. These settings apply to every output in your job. In addition to specifying these values, you also need to store your Kantar credentials in AWS Secrets Manager. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/kantar-watermarking.html.

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
from openapi_client.models.kantar_watermark_settings import KantarWatermarkSettings

# TODO update the JSON string below
json = "{}"
# create an instance of KantarWatermarkSettings from a JSON string
kantar_watermark_settings_instance = KantarWatermarkSettings.from_json(json)
# print the JSON string representation of the object
print(KantarWatermarkSettings.to_json())

# convert the object into a dict
kantar_watermark_settings_dict = kantar_watermark_settings_instance.to_dict()
# create an instance of KantarWatermarkSettings from a dict
kantar_watermark_settings_from_dict = KantarWatermarkSettings.from_dict(kantar_watermark_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


