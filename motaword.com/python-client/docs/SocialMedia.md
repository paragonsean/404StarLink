# SocialMedia


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**facebook_url** | **str** |  | [optional] 
**linked_in_url** | **str** |  | [optional] 
**twitter_url** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.social_media import SocialMedia

# TODO update the JSON string below
json = "{}"
# create an instance of SocialMedia from a JSON string
social_media_instance = SocialMedia.from_json(json)
# print the JSON string representation of the object
print(SocialMedia.to_json())

# convert the object into a dict
social_media_dict = social_media_instance.to_dict()
# create an instance of SocialMedia from a dict
social_media_from_dict = SocialMedia.from_dict(social_media_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


