# PullRequestReviewRequest

Pull Request Review Request

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**teams** | [**List[Team]**](Team.md) |  | 
**users** | [**List[SimpleUser]**](SimpleUser.md) |  | 

## Example

```python
from openapi_client.models.pull_request_review_request import PullRequestReviewRequest

# TODO update the JSON string below
json = "{}"
# create an instance of PullRequestReviewRequest from a JSON string
pull_request_review_request_instance = PullRequestReviewRequest.from_json(json)
# print the JSON string representation of the object
print(PullRequestReviewRequest.to_json())

# convert the object into a dict
pull_request_review_request_dict = pull_request_review_request_instance.to_dict()
# create an instance of PullRequestReviewRequest from a dict
pull_request_review_request_from_dict = PullRequestReviewRequest.from_dict(pull_request_review_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


