# coding: utf-8

"""
    AWS Elemental MediaConvert

    AWS Elemental MediaConvert

    The version of the OpenAPI document: 2017-08-29
    Contact: mike.ralphson@gmail.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.caption_selector_source_settings import CaptionSelectorSourceSettings
from typing import Optional, Set
from typing_extensions import Self

class CaptionSelector(BaseModel):
    """
    Use captions selectors to specify the captions data from your input that you use in your outputs. You can use up to 20 captions selectors per input.
    """ # noqa: E501
    custom_language_code: Optional[Any] = Field(default=None, alias="CustomLanguageCode")
    language_code: Optional[Any] = Field(default=None, alias="LanguageCode")
    source_settings: Optional[CaptionSelectorSourceSettings] = Field(default=None, alias="SourceSettings")
    __properties: ClassVar[List[str]] = ["CustomLanguageCode", "LanguageCode", "SourceSettings"]

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
        """Create an instance of CaptionSelector from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of language_code
        if self.language_code:
            _dict['LanguageCode'] = self.language_code.to_dict()
        # override the default output from pydantic by calling `to_dict()` of source_settings
        if self.source_settings:
            _dict['SourceSettings'] = self.source_settings.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of CaptionSelector from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "CustomLanguageCode": obj.get("CustomLanguageCode"),
            "LanguageCode": LanguageCode.from_dict(obj["LanguageCode"]) if obj.get("LanguageCode") is not None else None,
            "SourceSettings": CaptionSelectorSourceSettings.from_dict(obj["SourceSettings"]) if obj.get("SourceSettings") is not None else None
        })
        return _obj


