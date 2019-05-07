export const environment = {
  production: true,
  apiUrl: 'https://nome_da_sua_uri.herokuapp.com', // aqui vai o nome da sua uri gerada no heroku

  tokenWhitelistedDomains: [ new RegExp('nome_da_sua_uri.herokuapp.com') ], // sem o https://
  tokenBlacklistedRoutes: [ new RegExp('\/oauth\/token') ]
};
