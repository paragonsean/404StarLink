# News


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | **str** |  | [optional] 
**news_id** | **int** |  | [optional] 
**player_id** | **int** |  | [optional] 
**source** | **str** |  | [optional] 
**team** | **str** |  | [optional] 
**team_id** | **int** |  | [optional] 
**terms_of_use** | **str** |  | [optional] 
**title** | **str** |  | [optional] 
**updated** | **str** |  | [optional] 
**url** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.news import News

# TODO update the JSON string below
json = "{}"
# create an instance of News from a JSON string
news_instance = News.from_json(json)
# print the JSON string representation of the object
print(News.to_json())

# convert the object into a dict
news_dict = news_instance.to_dict()
# create an instance of News from a dict
news_from_dict = News.from_dict(news_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


