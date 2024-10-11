# PullRequestReviewLinks


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**html** | [**PullRequestReviewLinksHtml**](PullRequestReviewLinksHtml.md) |  | 
**pull_request** | [**PullRequestReviewLinksHtml**](PullRequestReviewLinksHtml.md) |  | 

## Example

```python
from openapi_client.models.pull_request_review_links import PullRequestReviewLinks

# TODO update the JSON string below
json = "{}"
# create an instance of PullRequestReviewLinks from a JSON string
pull_request_review_links_instance = PullRequestReviewLinks.from_json(json)
# print the JSON string representation of the object
print(PullRequestReviewLinks.to_json())

# convert the object into a dict
pull_request_review_links_dict = pull_request_review_links_instance.to_dict()
# create an instance of PullRequestReviewLinks from a dict
pull_request_review_links_from_dict = PullRequestReviewLinks.from_dict(pull_request_review_links_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


