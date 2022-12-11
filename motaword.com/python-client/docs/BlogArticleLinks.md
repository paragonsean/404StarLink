# BlogArticleLinks


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**var_self** | [**Href**](Href.md) |  | [optional] 
**android** | [**Href**](Href.md) |  | [optional] 
**header_image** | [**Href**](Href.md) |  | [optional] 
**ios** | [**Href**](Href.md) |  | [optional] 
**web** | [**Href**](Href.md) |  | [optional] 

## Example

```python
from openapi_client.models.blog_article_links import BlogArticleLinks

# TODO update the JSON string below
json = "{}"
# create an instance of BlogArticleLinks from a JSON string
blog_article_links_instance = BlogArticleLinks.from_json(json)
# print the JSON string representation of the object
print(BlogArticleLinks.to_json())

# convert the object into a dict
blog_article_links_dict = blog_article_links_instance.to_dict()
# create an instance of BlogArticleLinks from a dict
blog_article_links_from_dict = BlogArticleLinks.from_dict(blog_article_links_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


