# coding: utf-8

"""
    GitHub v3 REST API

    GitHub's v3 REST API.

    The version of the OpenAPI document: 1.1.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from typing_extensions import Annotated
from typing import Optional, Set
from typing_extensions import Self

class OauthAuthorizationsGetOrCreateAuthorizationForAppRequest(BaseModel):
    """
    OauthAuthorizationsGetOrCreateAuthorizationForAppRequest
    """ # noqa: E501
    client_secret: Annotated[str, Field(strict=True, max_length=40)] = Field(description="The OAuth app client secret for which to create the token.")
    fingerprint: Optional[StrictStr] = Field(default=None, description="A unique string to distinguish an authorization from others created for the same client ID and user.")
    note: Optional[StrictStr] = Field(default=None, description="A note to remind you what the OAuth token is for.")
    note_url: Optional[StrictStr] = Field(default=None, description="A URL to remind you what app the OAuth token is for.")
    scopes: Optional[List[StrictStr]] = Field(default=None, description="A list of scopes that this authorization is in.")
    __properties: ClassVar[List[str]] = ["client_secret", "fingerprint", "note", "note_url", "scopes"]

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
        """Create an instance of OauthAuthorizationsGetOrCreateAuthorizationForAppRequest from a JSON string"""
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
        # set to None if scopes (nullable) is None
        # and model_fields_set contains the field
        if self.scopes is None and "scopes" in self.model_fields_set:
            _dict['scopes'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of OauthAuthorizationsGetOrCreateAuthorizationForAppRequest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "client_secret": obj.get("client_secret"),
            "fingerprint": obj.get("fingerprint"),
            "note": obj.get("note"),
            "note_url": obj.get("note_url"),
            "scopes": obj.get("scopes")
        })
        return _obj


