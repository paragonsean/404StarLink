# FormFieldDefinition

Definition of a form field for OCR data extraction from images

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allow_numeric_digits** | **bool** | Optional - set to false to block values that contain numeric digits, set to true to allow numeric digits | [optional] 
**alternate_anchor** | **str** | Optional - alterate match text for the specified anchor | [optional] 
**anchor_mode** | **str** | Optional - the matching mode for the anchor.  Possible values are Complete (requires the entire anchor to match) and Partial (allows only part of the anchor to match) and Horizontal (anchor must be laid out horizontally).  Default is Partial. | [optional] 
**bottom_anchor** | **str** | Optional - the bottom anchor of the field | [optional] 
**data_type** | **str** | The data type of the field; possible values are INTEGER (Integer value), STRING (Arbitrary string value, spaces are permitted), DATE (Date in a structured format), DECIMAL (Decimal number), ALPHANUMERIC (Continuous alphanumeric string with no spaces), STRINGNOWHITESPACE (A string that contains no whitespace characters), SERIALNUMBER (A serial-number style string that contains letters and numbers, and certain symbols; must contain at least one number), ALPHAONLY (Alphabet characters only, no numbers or symbols or whitespace) | [optional] 
**field_id** | **str** | The identifier of the field; use this to identify which field is being referenced.  Set to SkipField if you do not wish to return the value of this field in the result. | [optional] 
**horizontal_alignment_type** | **str** | Horizontal alignment of target value area relative to the field anchor; Possible values are Left, Right | [optional] 
**ignore** | **List[str]** | Optional - Ignore any result items that contain a partial or complete match with these text strings | [optional] 
**left_anchor** | **str** | Optional - the left-hand anchor of the field | [optional] 
**minimum_character_count** | **int** | Optional - the target number of digits in the field; useful for fixed-length fields | [optional] 
**options** | **str** | Optional - additional options that can be set for this field definition, separated by commas.  Possible values are AllowMultiMatch (allow the same anchor to be matched to multiple fields) | [optional] 
**target_digit_count** | **int** | Optional - the target number of digits in the field; useful for fixed-length fields | [optional] 
**target_field_height_relative** | **float** | Optional - scale factor for target field height - relative to height of field title | [optional] 
**target_field_horizontal_adjustment** | **float** | Optional - horizontal adjestment in relative width of the field | [optional] 
**target_field_vertical_adjustment** | **float** | Optional - vertical adjestment in relative height of the field | [optional] 
**target_field_width_relative** | **float** | Optional - scale factor for target field width - relative to width of field title; a value of 1.0 indicates the target value area has the same width as the field value as occurring in the image; a value of 2.0 would indicate that the target value area has 2 times the width of the field value as occurring in the image. | [optional] 
**top_anchor** | **str** | Optional - the top anchor of the field | [optional] 
**vertical_alignment_type** | **str** | Vertical alignment of target value area relative to the field anchor; Possible values are VCenter, Top, Bottom | [optional] 

## Example

```python
from openapi_client.models.form_field_definition import FormFieldDefinition

# TODO update the JSON string below
json = "{}"
# create an instance of FormFieldDefinition from a JSON string
form_field_definition_instance = FormFieldDefinition.from_json(json)
# print the JSON string representation of the object
print(FormFieldDefinition.to_json())

# convert the object into a dict
form_field_definition_dict = form_field_definition_instance.to_dict()
# create an instance of FormFieldDefinition from a dict
form_field_definition_from_dict = FormFieldDefinition.from_dict(form_field_definition_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


