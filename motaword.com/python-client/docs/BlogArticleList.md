# BlogArticleList


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**articles** | [**List[BlogArticle]**](BlogArticle.md) |  | [optional] 
**meta** | [**PagingMeta**](PagingMeta.md) |  | [optional] 

## Example

```python
from openapi_client.models.blog_article_list import BlogArticleList

# TODO update the JSON string below
json = "{}"
# create an instance of BlogArticleList from a JSON string
blog_article_list_instance = BlogArticleList.from_json(json)
# print the JSON string representation of the object
print(BlogArticleList.to_json())

# convert the object into a dict
blog_article_list_dict = blog_article_list_instance.to_dict()
# create an instance of BlogArticleList from a dict
blog_article_list_from_dict = BlogArticleList.from_dict(blog_article_list_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


