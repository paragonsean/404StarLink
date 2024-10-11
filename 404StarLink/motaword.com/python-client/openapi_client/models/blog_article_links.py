# coding: utf-8

"""
    MotaWord API

    Use MotaWord API to post and track your translation projects.

    The version of the OpenAPI document: 1.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.href import Href
from typing import Optional, Set
from typing_extensions import Self

class BlogArticleLinks(BaseModel):
    """
    BlogArticleLinks
    """ # noqa: E501
    var_self: Optional[Href] = Field(default=None, alias="self")
    android: Optional[Href] = None
    header_image: Optional[Href] = None
    ios: Optional[Href] = None
    web: Optional[Href] = None
    __properties: ClassVar[List[str]] = ["self", "android", "header_image", "ios", "web"]

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
        """Create an instance of BlogArticleLinks from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of var_self
        if self.var_self:
            _dict['self'] = self.var_self.to_dict()
        # override the default output from pydantic by calling `to_dict()` of android
        if self.android:
            _dict['android'] = self.android.to_dict()
        # override the default output from pydantic by calling `to_dict()` of header_image
        if self.header_image:
            _dict['header_image'] = self.header_image.to_dict()
        # override the default output from pydantic by calling `to_dict()` of ios
        if self.ios:
            _dict['ios'] = self.ios.to_dict()
        # override the default output from pydantic by calling `to_dict()` of web
        if self.web:
            _dict['web'] = self.web.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of BlogArticleLinks from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "self": Href.from_dict(obj["self"]) if obj.get("self") is not None else None,
            "android": Href.from_dict(obj["android"]) if obj.get("android") is not None else None,
            "header_image": Href.from_dict(obj["header_image"]) if obj.get("header_image") is not None else None,
            "ios": Href.from_dict(obj["ios"]) if obj.get("ios") is not None else None,
            "web": Href.from_dict(obj["web"]) if obj.get("web") is not None else None
        })
        return _obj


