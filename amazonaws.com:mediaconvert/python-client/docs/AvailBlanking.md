# AvailBlanking

Use ad avail blanking settings to specify your output content during SCTE-35 triggered ad avails. You can blank your video or overlay it with an image. MediaConvert also removes any audio and embedded captions during the ad avail. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/ad-avail-blanking.html.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**avail_blanking_image** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.avail_blanking import AvailBlanking

# TODO update the JSON string below
json = "{}"
# create an instance of AvailBlanking from a JSON string
avail_blanking_instance = AvailBlanking.from_json(json)
# print the JSON string representation of the object
print(AvailBlanking.to_json())

# convert the object into a dict
avail_blanking_dict = avail_blanking_instance.to_dict()
# create an instance of AvailBlanking from a dict
avail_blanking_from_dict = AvailBlanking.from_dict(avail_blanking_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


