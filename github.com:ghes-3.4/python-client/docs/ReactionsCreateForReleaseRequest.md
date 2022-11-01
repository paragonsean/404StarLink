# ReactionsCreateForReleaseRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | **str** | The [reaction type](https://docs.github.com/enterprise-server@3.4/rest/reference/reactions#reaction-types) to add to the release. | 

## Example

```python
from openapi_client.models.reactions_create_for_release_request import ReactionsCreateForReleaseRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ReactionsCreateForReleaseRequest from a JSON string
reactions_create_for_release_request_instance = ReactionsCreateForReleaseRequest.from_json(json)
# print the JSON string representation of the object
print(ReactionsCreateForReleaseRequest.to_json())

# convert the object into a dict
reactions_create_for_release_request_dict = reactions_create_for_release_request_instance.to_dict()
# create an instance of ReactionsCreateForReleaseRequest from a dict
reactions_create_for_release_request_from_dict = ReactionsCreateForReleaseRequest.from_dict(reactions_create_for_release_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


