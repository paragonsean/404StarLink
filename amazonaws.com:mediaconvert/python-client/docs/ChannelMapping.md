# ChannelMapping

Channel mapping (ChannelMapping) contains the group of fields that hold the remixing value for each channel, in dB. Specify remix values to indicate how much of the content from your input audio channel you want in your output audio channels. Each instance of the InputChannels or InputChannelsFineTune array specifies these values for one output channel. Use one instance of this array for each output channel. In the console, each array corresponds to a column in the graphical depiction of the mapping matrix. The rows of the graphical matrix correspond to input channels. Valid values are within the range from -60 (mute) through 6. A setting of 0 passes the input channel unchanged to the output channel (no attenuation or amplification). Use InputChannels or InputChannelsFineTune to specify your remix values. Don't use both.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**output_channels** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.channel_mapping import ChannelMapping

# TODO update the JSON string below
json = "{}"
# create an instance of ChannelMapping from a JSON string
channel_mapping_instance = ChannelMapping.from_json(json)
# print the JSON string representation of the object
print(ChannelMapping.to_json())

# convert the object into a dict
channel_mapping_dict = channel_mapping_instance.to_dict()
# create an instance of ChannelMapping from a dict
channel_mapping_from_dict = ChannelMapping.from_dict(channel_mapping_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


