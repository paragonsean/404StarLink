# coding: utf-8

"""
    Cloud Build API

    Creates and manages builds on Google Cloud Platform.

    The version of the OpenAPI document: v1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from typing import Optional, Set
from typing_extensions import Self

class GitHubEnterpriseSecrets(BaseModel):
    """
    GitHubEnterpriseSecrets represents the names of all necessary secrets in Secret Manager for a GitHub Enterprise server. Format is: projects//secrets/.
    """ # noqa: E501
    oauth_client_id_name: Optional[StrictStr] = Field(default=None, description="The resource name for the OAuth client ID secret in Secret Manager.", alias="oauthClientIdName")
    oauth_client_id_version_name: Optional[StrictStr] = Field(default=None, description="The resource name for the OAuth client ID secret version in Secret Manager.", alias="oauthClientIdVersionName")
    oauth_secret_name: Optional[StrictStr] = Field(default=None, description="The resource name for the OAuth secret in Secret Manager.", alias="oauthSecretName")
    oauth_secret_version_name: Optional[StrictStr] = Field(default=None, description="The resource name for the OAuth secret secret version in Secret Manager.", alias="oauthSecretVersionName")
    private_key_name: Optional[StrictStr] = Field(default=None, description="The resource name for the private key secret.", alias="privateKeyName")
    private_key_version_name: Optional[StrictStr] = Field(default=None, description="The resource name for the private key secret version.", alias="privateKeyVersionName")
    webhook_secret_name: Optional[StrictStr] = Field(default=None, description="The resource name for the webhook secret in Secret Manager.", alias="webhookSecretName")
    webhook_secret_version_name: Optional[StrictStr] = Field(default=None, description="The resource name for the webhook secret secret version in Secret Manager.", alias="webhookSecretVersionName")
    __properties: ClassVar[List[str]] = ["oauthClientIdName", "oauthClientIdVersionName", "oauthSecretName", "oauthSecretVersionName", "privateKeyName", "privateKeyVersionName", "webhookSecretName", "webhookSecretVersionName"]

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
        """Create an instance of GitHubEnterpriseSecrets from a JSON string"""
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
        """Create an instance of GitHubEnterpriseSecrets from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "oauthClientIdName": obj.get("oauthClientIdName"),
            "oauthClientIdVersionName": obj.get("oauthClientIdVersionName"),
            "oauthSecretName": obj.get("oauthSecretName"),
            "oauthSecretVersionName": obj.get("oauthSecretVersionName"),
            "privateKeyName": obj.get("privateKeyName"),
            "privateKeyVersionName": obj.get("privateKeyVersionName"),
            "webhookSecretName": obj.get("webhookSecretName"),
            "webhookSecretVersionName": obj.get("webhookSecretVersionName")
        })
        return _obj


