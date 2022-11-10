# Twitter

Twitter data

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**handle** | **str** | Twitter handle | [optional] 
**hashtags** | **List[str]** | Twitter hashtags | [optional] 

## Example

```python
from openapi_client.models.twitter import Twitter

# TODO update the JSON string below
json = "{}"
# create an instance of Twitter from a JSON string
twitter_instance = Twitter.from_json(json)
# print the JSON string representation of the object
print(Twitter.to_json())

# convert the object into a dict
twitter_dict = twitter_instance.to_dict()
# create an instance of Twitter from a dict
twitter_from_dict = Twitter.from_dict(twitter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


