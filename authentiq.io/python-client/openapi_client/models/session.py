# coding: utf-8

"""
    Authentiq Connect API

    Authentiq Connect OAuth 2.0 and OpenID Connect API reference. Learn about [Authentiq ID](https://www.authentiq.com/) or check out the [Authentiq Connect](https://developers.authentiq.com) developer documentation. 

    The version of the OpenAPI document: 1.0
    Contact: hello@authentiq.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from datetime import datetime
from pydantic import BaseModel, ConfigDict, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from typing import Optional, Set
from typing_extensions import Self

class Session(BaseModel):
    """
    Session object
    """ # noqa: E501
    authenticated_at: Optional[datetime] = None
    client_id: Optional[StrictStr] = None
    client_name: Optional[StrictStr] = None
    client_uri: Optional[StrictStr] = None
    concluded_at: Optional[datetime] = None
    connected_at: Optional[datetime] = None
    contacts: Optional[List[StrictStr]] = None
    created_at: Optional[StrictStr] = None
    deleted_at: Optional[datetime] = None
    logo_uri: Optional[StrictStr] = None
    nonce: Optional[StrictStr] = None
    policy_uri: Optional[StrictStr] = None
    redirect_uri: Optional[StrictStr] = None
    response_mode: Optional[StrictStr] = None
    response_type: Optional[StrictStr] = None
    scopes: Optional[List[StrictStr]] = None
    scopes_optional: Optional[List[StrictStr]] = None
    scopes_required: Optional[List[StrictStr]] = None
    scopes_seen: Optional[List[StrictStr]] = None
    scopes_signed: Optional[List[StrictStr]] = None
    session_id: Optional[StrictStr] = None
    session_state: Optional[StrictStr] = None
    session_uri: Optional[StrictStr] = None
    sub: Optional[StrictStr] = None
    tokens_seen: Optional[List[StrictStr]] = None
    tos_uri: Optional[StrictStr] = None
    version: Optional[StrictInt] = None
    __properties: ClassVar[List[str]] = ["authenticated_at", "client_id", "client_name", "client_uri", "concluded_at", "connected_at", "contacts", "created_at", "deleted_at", "logo_uri", "nonce", "policy_uri", "redirect_uri", "response_mode", "response_type", "scopes", "scopes_optional", "scopes_required", "scopes_seen", "scopes_signed", "session_id", "session_state", "session_uri", "sub", "tokens_seen", "tos_uri", "version"]

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
        """Create an instance of Session from a JSON string"""
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
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Session from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "authenticated_at": obj.get("authenticated_at"),
            "client_id": obj.get("client_id"),
            "client_name": obj.get("client_name"),
            "client_uri": obj.get("client_uri"),
            "concluded_at": obj.get("concluded_at"),
            "connected_at": obj.get("connected_at"),
            "contacts": obj.get("contacts"),
            "created_at": obj.get("created_at"),
            "deleted_at": obj.get("deleted_at"),
            "logo_uri": obj.get("logo_uri"),
            "nonce": obj.get("nonce"),
            "policy_uri": obj.get("policy_uri"),
            "redirect_uri": obj.get("redirect_uri"),
            "response_mode": obj.get("response_mode"),
            "response_type": obj.get("response_type"),
            "scopes": obj.get("scopes"),
            "scopes_optional": obj.get("scopes_optional"),
            "scopes_required": obj.get("scopes_required"),
            "scopes_seen": obj.get("scopes_seen"),
            "scopes_signed": obj.get("scopes_signed"),
            "session_id": obj.get("session_id"),
            "session_state": obj.get("session_state"),
            "session_uri": obj.get("session_uri"),
            "sub": obj.get("sub"),
            "tokens_seen": obj.get("tokens_seen"),
            "tos_uri": obj.get("tos_uri"),
            "version": obj.get("version")
        })
        return _obj


