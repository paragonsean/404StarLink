# News


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**author** | **str** |  | [optional] 
**categories** | **str** |  | [optional] 
**content** | **str** |  | [optional] 
**news_id** | **int** |  | [optional] 
**original_source** | **str** |  | [optional] 
**original_source_url** | **str** |  | [optional] 
**player_id** | **int** |  | [optional] 
**player_id2** | **int** |  | [optional] 
**source** | **str** |  | [optional] 
**team** | **str** |  | [optional] 
**team2** | **str** |  | [optional] 
**team_id** | **int** |  | [optional] 
**team_id2** | **int** |  | [optional] 
**terms_of_use** | **str** |  | [optional] 
**time_ago** | **str** |  | [optional] 
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


