//grails.plugin.springsecurity.rest.token.storage.jwt.secret = '9e548c06c9bc1fae358e0bb166097c47cafc9e8be05bca289409ec77e0836964'
//grails.plugin.springsecurity.rest.token.storage.jwt.expiration = 7200
//grails.plugin.springsecurity.useSecurityEventListener = true
//grails.plugin.springsecurity.useBasicAuth = true
//
//grails.plugin.springsecurity.userLookup.userDomainClassName = 'comum.Usuario'
//grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'comum.UsuarioPermissao'
//grails.plugin.springsecurity.authority.className = 'comum.Permissao'
//grails.plugin.springsecurity.requestMap.className = 'comum.RequestMap'
//
//grails.plugin.springsecurity.securityConfigType = "Requestmap"
//
//grails.plugin.springsecurity.filterChain.chainMap = [
//		'/produto/index/**': 'JOINED_FILTERS,-exceptionTranslationFilter',
//		'/**': 'JOINED_FILTERS,-basicAuthenticationFilter,-basicExceptionTranslationFilter'
//]
//
//grails.plugin.springsecurity.controllerAnnotations.staticRules = [
//		[pattern: '/',               access: ['permitAll']],
//		[pattern: '/error',          access: ['permitAll']],
//		[pattern: '/index',          access: ['permitAll']],
//		[pattern: '/index.gsp',      access: ['permitAll']],
//		[pattern: '/shutdown',       access: ['permitAll']],
//		[pattern: '/assets/**',      access: ['permitAll']],
//		[pattern: '/**/js/**',       access: ['permitAll']],
//		[pattern: '/**/css/**',      access: ['permitAll']],
//		[pattern: '/**/images/**',   access: ['permitAll']],
//		[pattern: '/**/favicon.ico', access: ['permitAll']],
//
//]


// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.userLookup.userDomainClassName = 'comum.Usuario'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'comum.UsuarioPermissao'
grails.plugin.springsecurity.authority.className = 'comum.Permissao'

grails.plugin.springsecurity.auth.loginFormUrl = '/areaRestrita/logar'
grails.plugin.springsecurity.logout.afterLogoutUrl = '/areaRestrita/logout'
grails.plugin.springsecurity.successHandler.defaultTargetUrl = '/areaRestrita/admin'
grails.plugin.springsecurity.failureHandler.defaultFailureUrl = '/areaRestrita/erro'
grails.plugin.springsecurity.successHandler.alwaysUseDefault = false
grails.plugin.springsecurity.dao.hideUserNotFoundExceptions = false
grails.plugin.springsecurity.adh.errorPage = "/j_spring_security_logout"
//grails.plugin.springsecurity.password.algorithm = 'SHA-256'
grails.plugin.springsecurity.password.algorithm = 'bcrypt'
//grails.plugin.springsecurity.password.algorithm = 'noop'

grails.plugin.springsecurity.securityConfigType = "InterceptUrlMap"

grails.plugin.springsecurity.interceptUrlMap = [
		[pattern: '/produto/index',         access:['ROLE_ADMIN']],
		[pattern: '/**',               access:['IS_AUTHENTICATED_ANONYMOUSLY']]
]

grails.plugin.springsecurity.controllerAnnotations.staticRules = [
		[pattern: '/',               access: ['permitAll']],
		[pattern: '/error',          access: ['permitAll']],
		[pattern: '/index',          access: ['permitAll']],
		[pattern: '/index.gsp',      access: ['permitAll']],
		[pattern: '/shutdown',       access: ['permitAll']],
		[pattern: '/assets/**',      access: ['permitAll']],
		[pattern: '/**/js/**',       access: ['permitAll']],
		[pattern: '/**/css/**',      access: ['permitAll']],
		[pattern: '/**/images/**',   access: ['permitAll']],
		[pattern: '/**/favicon.ico', access: ['permitAll']]
]

grails.plugin.springsecurity.filterChain.chainMap = [
		[pattern: '/assets/**',      filters: 'none'],
		[pattern: '/**/js/**',       filters: 'none'],
		[pattern: '/**/css/**',      filters: 'none'],
		[pattern: '/**/images/**',   filters: 'none'],
		[pattern: '/**/favicon.ico', filters: 'none'],
		[pattern: '/**',             filters: 'JOINED_FILTERS']
]