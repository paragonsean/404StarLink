# BlogArticle


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**announcement_type** | **str** |  | [optional] 
**author** | **str** |  | [optional] 
**content** | **str** | Article content | [optional] 
**created_at** | **datetime** | the date-time notation as defined by RFC 3339, section 5.6, for example, 2017-07-21T17:32:28Z | [optional] 
**excerpt** | **str** | Article excerpt | [optional] 
**id** | **int** |  | [optional] 
**language** | **str** | language code | [optional] 
**links** | [**BlogArticleLinks**](BlogArticleLinks.md) |  | [optional] 
**slug** | **str** |  | [optional] 
**title** | **str** |  | [optional] 
**topic** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.blog_article import BlogArticle

# TODO update the JSON string below
json = "{}"
# create an instance of BlogArticle from a JSON string
blog_article_instance = BlogArticle.from_json(json)
# print the JSON string representation of the object
print(BlogArticle.to_json())

# convert the object into a dict
blog_article_dict = blog_article_instance.to_dict()
# create an instance of BlogArticle from a dict
blog_article_from_dict = BlogArticle.from_dict(blog_article_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


