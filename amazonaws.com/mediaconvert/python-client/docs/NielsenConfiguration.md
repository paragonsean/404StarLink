# NielsenConfiguration

Settings for your Nielsen configuration. If you don't do Nielsen measurement and analytics, ignore these settings. When you enable Nielsen configuration (nielsenConfiguration), MediaConvert enables PCM to ID3 tagging for all outputs in the job. To enable Nielsen configuration programmatically, include an instance of nielsenConfiguration in your JSON job specification. Even if you don't include any children of nielsenConfiguration, you still enable the setting.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**breakout_code** | **int** |  | [optional] 
**distributor_id** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.nielsen_configuration import NielsenConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of NielsenConfiguration from a JSON string
nielsen_configuration_instance = NielsenConfiguration.from_json(json)
# print the JSON string representation of the object
print(NielsenConfiguration.to_json())

# convert the object into a dict
nielsen_configuration_dict = nielsen_configuration_instance.to_dict()
# create an instance of NielsenConfiguration from a dict
nielsen_configuration_from_dict = NielsenConfiguration.from_dict(nielsen_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


