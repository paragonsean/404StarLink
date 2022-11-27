# JourneyChannelSettings

The channel-specific configurations for the journey.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**connect_campaign_arn** | **str** |  | [optional] 
**connect_campaign_execution_role_arn** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.journey_channel_settings import JourneyChannelSettings

# TODO update the JSON string below
json = "{}"
# create an instance of JourneyChannelSettings from a JSON string
journey_channel_settings_instance = JourneyChannelSettings.from_json(json)
# print the JSON string representation of the object
print(JourneyChannelSettings.to_json())

# convert the object into a dict
journey_channel_settings_dict = journey_channel_settings_instance.to_dict()
# create an instance of JourneyChannelSettings from a dict
journey_channel_settings_from_dict = JourneyChannelSettings.from_dict(journey_channel_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


