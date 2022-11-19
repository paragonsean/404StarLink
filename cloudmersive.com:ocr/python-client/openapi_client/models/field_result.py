# coding: utf-8

"""
    ocrapi

    The powerful Optical Character Recognition (OCR) APIs let you convert scanned images of pages into recognized text.

    The version of the OpenAPI document: v1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.form_field_definition import FormFieldDefinition
from openapi_client.models.ocr_photo_text_element import OcrPhotoTextElement
from typing import Optional, Set
from typing_extensions import Self

class FieldResult(BaseModel):
    """
    A pairing target field and actual value read from form
    """ # noqa: E501
    field_values: Optional[List[OcrPhotoTextElement]] = Field(default=None, description="Result field value(s) extracted", alias="FieldValues")
    target_field: Optional[FormFieldDefinition] = Field(default=None, alias="TargetField")
    __properties: ClassVar[List[str]] = ["FieldValues", "TargetField"]

    model_config = ConfigDict(
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
    )


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        """Create an instance of FieldResult from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        excluded_fields: Set[str] = set([
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # override the default output from pydantic by calling `to_dict()` of each item in field_values (list)
        _items = []
        if self.field_values:
            for _item_field_values in self.field_values:
                if _item_field_values:
                    _items.append(_item_field_values.to_dict())
            _dict['FieldValues'] = _items
        # override the default output from pydantic by calling `to_dict()` of target_field
        if self.target_field:
            _dict['TargetField'] = self.target_field.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of FieldResult from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "FieldValues": [OcrPhotoTextElement.from_dict(_item) for _item in obj["FieldValues"]] if obj.get("FieldValues") is not None else None,
            "TargetField": FormFieldDefinition.from_dict(obj["TargetField"]) if obj.get("TargetField") is not None else None
        })
        return _obj


