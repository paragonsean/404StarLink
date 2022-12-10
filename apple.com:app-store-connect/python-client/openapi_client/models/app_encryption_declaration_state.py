# coding: utf-8

"""
    App Store Connect API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.4.1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import json
from enum import Enum
from typing_extensions import Self


class AppEncryptionDeclarationState(str, Enum):
    """
    AppEncryptionDeclarationState
    """

    """
    allowed enum values
    """
    IN_REVIEW = 'IN_REVIEW'
    APPROVED = 'APPROVED'
    REJECTED = 'REJECTED'
    INVALID = 'INVALID'
    EXPIRED = 'EXPIRED'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of AppEncryptionDeclarationState from a JSON string"""
        return cls(json.loads(json_str))


