# coding: utf-8

"""
    PageSpeed Insights

    Analyzes the performance of a web page and provides tailored suggestions to make that page faster.

    The version of the OpenAPI document: v4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.pagespeed_api_format_string_v4_args_inner_rects_inner import PagespeedApiFormatStringV4ArgsInnerRectsInner
from typing import Optional, Set
from typing_extensions import Self

class PagespeedApiFormatStringV4ArgsInner(BaseModel):
    """
    PagespeedApiFormatStringV4ArgsInner
    """ # noqa: E501
    key: Optional[StrictStr] = Field(default=None, description="The placeholder key for this arg, as a string.")
    rects: Optional[List[PagespeedApiFormatStringV4ArgsInnerRectsInner]] = Field(default=None, description="The screen rectangles being referred to, with dimensions measured in CSS pixels. This is only ever used for SNAPSHOT_RECT arguments. If this is absent for a SNAPSHOT_RECT argument, it means that that argument refers to the entire snapshot.")
    secondary_rects: Optional[List[PagespeedApiFormatStringV4ArgsInnerRectsInner]] = Field(default=None, description="Secondary screen rectangles being referred to, with dimensions measured in CSS pixels. This is only ever used for SNAPSHOT_RECT arguments.")
    type: Optional[StrictStr] = Field(default=None, description="Type of argument. One of URL, STRING_LITERAL, INT_LITERAL, BYTES, DURATION, VERBATIM_STRING, PERCENTAGE, HYPERLINK, or SNAPSHOT_RECT.")
    value: Optional[StrictStr] = Field(default=None, description="Argument value, as a localized string.")
    __properties: ClassVar[List[str]] = ["key", "rects", "secondary_rects", "type", "value"]

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
        """Create an instance of PagespeedApiFormatStringV4ArgsInner from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in rects (list)
        _items = []
        if self.rects:
            for _item_rects in self.rects:
                if _item_rects:
                    _items.append(_item_rects.to_dict())
            _dict['rects'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in secondary_rects (list)
        _items = []
        if self.secondary_rects:
            for _item_secondary_rects in self.secondary_rects:
                if _item_secondary_rects:
                    _items.append(_item_secondary_rects.to_dict())
            _dict['secondary_rects'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of PagespeedApiFormatStringV4ArgsInner from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "key": obj.get("key"),
            "rects": [PagespeedApiFormatStringV4ArgsInnerRectsInner.from_dict(_item) for _item in obj["rects"]] if obj.get("rects") is not None else None,
            "secondary_rects": [PagespeedApiFormatStringV4ArgsInnerRectsInner.from_dict(_item) for _item in obj["secondary_rects"]] if obj.get("secondary_rects") is not None else None,
            "type": obj.get("type"),
            "value": obj.get("value")
        })
        return _obj


