# ProfilePictureUpload


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**profile_picture** | **bytearray** | Profile picture file contents. Accepted extensions are png, jpg. | 

## Example

```python
from openapi_client.models.profile_picture_upload import ProfilePictureUpload

# TODO update the JSON string below
json = "{}"
# create an instance of ProfilePictureUpload from a JSON string
profile_picture_upload_instance = ProfilePictureUpload.from_json(json)
# print the JSON string representation of the object
print(ProfilePictureUpload.to_json())

# convert the object into a dict
profile_picture_upload_dict = profile_picture_upload_instance.to_dict()
# create an instance of ProfilePictureUpload from a dict
profile_picture_upload_from_dict = ProfilePictureUpload.from_dict(profile_picture_upload_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


